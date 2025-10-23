import requests
import pandas as pd

url = "http://localhost:8000/api/"
# url = 

# Dados que serão enviados para API:
data = {'buying' : 1,
        'maint' : 4,
        'lug_boot' : 0,
        'safety' : 3,
        'doors_2' : 1,
        'doors_3' : 0,
        'doors_4' : 0,
        'doors_5more' : 0,
        'persons_2' : 0,
        'persons_4' : 1,
        'persons_more' : 0}
# Enviar a requisição via POST:
response = requests.post(url, json=data)
# Verificar a resposta da API
if response.status_code == 200:
    print("Dados enviados com sucesso!")
    # response.json(): JSON --> Dicionário
    resultado = response.json()
    print("Para os dados enviados a estimativa foi:")
    print(resultado["previsão"])
else:
    print(f"Erro: {response.status_code}")