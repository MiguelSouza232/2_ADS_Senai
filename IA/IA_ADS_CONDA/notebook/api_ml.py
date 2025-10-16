import joblib
import pandas as pd
import uvicorn
import nest_asyncio
from pydantic import BaseModel
from fastapi import FastAPI

# Validação da estrutura dos dados com o pydantic
class InputData(BaseModel):
  buying: float
  maint: float
  lug_boot: float
  safety: float
  doors_2: int
  doors_3: int
  doors_4: int
  doors_Smore: int
  persons_2: int
  persons_4: int
  persons_more: int
  
# Instanciar um objeto em FastAPI
app = FastAPI()

# Definir  a rota que receberá os dados via POST
@app.post("/api/")
async def recebe_dados(data: InputData):
  pre_processamento = "scaler.pkl"
  modelo = "modelo_SVM.pkl"
  # Carregando os modelo salvos:
  scaler = joblib.load(pre_processamento)
  model = joblib.load(modelo)
  dados = {'buying' : [data.buying],
           'maint' : [data.maint],
         'lug_boot' : [data.lug_boot],
           'safety' : [data.safety],
           'doors_2' : [data.doors_2],
           'doors_3' : [data.doors_3],
           'doors_4' : [data.doors_4],
           'doors_Smore' : [data.doors_Smore],
           'persons_2' : [data.persons_2],
           'persons_4' : [data.persons_4],
           'persons_more' : [data.persons_more]}
  # Transfomrando o dado recebido em um DataFrame
  dado_previsao = pd.DataFrame(dados)
  # Ajustando a escala dos dados
  dado_previsao - scaler.transform(dado_previsao)
  # Fazendo a previsão com M.L.:
  resultado = model.predict(dado_previsao)
  return {"resposta": resultado[0]}
print("Aguardnado o envio de mensagens")
nest_asyncio.apply()
uvicorn.run(app, host="0.0.0.0", port=8000)