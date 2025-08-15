
package projectcalculadora.projectcalculadora;

import java.text.DecimalFormat;

public class CalculadoraGUI extends javax.swing.JFrame {
    
    private double valor1;
    private double valor2;
    private String operacao;
    private final DecimalFormat df = new DecimalFormat("#.##########");
    private boolean calculoRealizado = false;

        private void entraNumero(String numero) {
        // Se um cálculo foi recém-realizado, limpa tudo para começar um novo
        if (calculoRealizado) {
            lblOperacao.setText("");
            txtResultado.setText("0");
            this.valor1 = 0;
            this.valor2 = 0;
            this.operacao = null;
            calculoRealizado = false;
        }
        
        String textoAtual = txtResultado.getText();
        if (textoAtual.equals("0") || textoAtual.contains("Erro")) {
            txtResultado.setText(numero);
        } else {
            txtResultado.setText(textoAtual + numero);
        }
    }

    private void defineOperacao(String op) {
        // Se nenhuma operação foi escolhida ainda
        if (operacao == null) {
            try {
                valor1 = Double.parseDouble(txtResultado.getText().replace(",", "."));
                lblOperacao.setText(df.format(valor1).replace(",", ".") + " " + op);
                txtResultado.setText("0");
                operacao = op;
            } catch (NumberFormatException e) {
                txtResultado.setText("Erro");
            }
        } else {
            // Se já existe uma operação, calcula o resultado parcial
            try {
                valor2 = Double.parseDouble(txtResultado.getText().replace(",", "."));
                realizarCalculo(); // Realiza o cálculo pendente
                valor1 = Double.parseDouble(txtResultado.getText().replace(",", "."));
                lblOperacao.setText(df.format(valor1).replace(",", ".") + " " + op);
                txtResultado.setText("0");
                operacao = op;
            } catch (NumberFormatException e) {
                txtResultado.setText("Erro");
            }
        }
    }

    private void realizarCalculo() {
        double resultado = 0;
        if (operacao != null) {
            switch (operacao) {
                case "+": resultado = valor1 + valor2; break;
                case "-": resultado = valor1 - valor2; break;
                case "*": resultado = valor1 * valor2; break;
                case "/":
                    if (valor2 == 0) {
                        txtResultado.setText("Erro: Divisão por 0");
                        return;
                    }
                    resultado = valor1 / valor2;
                    break;
            }
            txtResultado.setText(df.format(resultado).replace(",", "."));
        }
    }
    
    public CalculadoraGUI() {
        initComponents();
        setLocationRelativeTo(null);
        
    btnUm.setOpaque(true); 
    btnUm.setBackground(java.awt.Color.WHITE);
    
    btnDois.setOpaque(true);
    btnDois.setBackground(java.awt.Color.WHITE);
    
    btnTres.setOpaque(true);
    btnTres.setBackground(java.awt.Color.WHITE);
    
    btnQuatro.setOpaque(true); 
    btnQuatro.setBackground(java.awt.Color.WHITE);
    
    btnCinco.setOpaque(true);
    btnCinco.setBackground(java.awt.Color.WHITE);
    
    btnSeis.setOpaque(true);
    btnSeis.setBackground(java.awt.Color.WHITE);
    
    btnSete.setOpaque(true); 
    btnSete.setBackground(java.awt.Color.WHITE);
    
    btnOito.setOpaque(true);
    btnOito.setBackground(java.awt.Color.WHITE);
    
    btnNove.setOpaque(true);
    btnNove.setBackground(java.awt.Color.WHITE);
    
    btnZero.setOpaque(true);
    btnZero.setBackground(java.awt.Color.WHITE);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResultado = new javax.swing.JTextField();
        btnZero = new javax.swing.JButton();
        btnUm = new javax.swing.JButton();
        btnDois = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnQuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnSete = new javax.swing.JButton();
        btnOito = new javax.swing.JButton();
        btnNove = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSomar = new javax.swing.JButton();
        btnSubtrair = new javax.swing.JButton();
        lblOperacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setText("0");
        txtResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnZero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnZero.setText("0");
        btnZero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnUm.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnUm.setText("1");
        btnUm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUmActionPerformed(evt);
            }
        });

        btnDois.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDois.setText("2");
        btnDois.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoisActionPerformed(evt);
            }
        });

        btnTres.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnTres.setText("3");
        btnTres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });

        btnQuatro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnQuatro.setText("4");
        btnQuatro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuatroActionPerformed(evt);
            }
        });

        btnCinco.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCinco.setText("5");
        btnCinco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });

        btnSeis.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSeis.setText("6");
        btnSeis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });

        btnSete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSete.setText("7");
        btnSete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeteActionPerformed(evt);
            }
        });

        btnOito.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnOito.setText("8");
        btnOito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOitoActionPerformed(evt);
            }
        });

        btnNove.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNove.setText("9");
        btnNove.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoveActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(153, 102, 255));
        btnIgual.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMultiplicacao.setBackground(new java.awt.Color(204, 204, 204));
        btnMultiplicacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMultiplicacao.setText("x");
        btnMultiplicacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });

        btnDivisao.setBackground(new java.awt.Color(204, 204, 204));
        btnDivisao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDivisao.setText("/");
        btnDivisao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimpar.setText("C");
        btnLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnSomar.setBackground(new java.awt.Color(204, 204, 204));
        btnSomar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSomar.setText("+");
        btnSomar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        btnSubtrair.setBackground(new java.awt.Color(204, 204, 204));
        btnSubtrair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnSubtrair.setText("-");
        btnSubtrair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtrairActionPerformed(evt);
            }
        });

        lblOperacao.setForeground(new java.awt.Color(153, 153, 153));
        lblOperacao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblOperacao)
                        .addGap(8, 8, 8)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(lblOperacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
         entraNumero("0");
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try {
            if (operacao != null) {
                String valor2Str = txtResultado.getText();
                this.valor2 = Double.parseDouble(valor2Str.replace(",", "."));
                
                // Monta a expressão completa no visor superior
                String valor1Str = df.format(this.valor1).replace(",", ".");
                lblOperacao.setText(valor1Str + " " + operacao + " " + valor2Str + " =");

                realizarCalculo();
                this.operacao = null;
                this.calculoRealizado = true; // Avisa que um cálculo foi finalizado
            }
        } catch (NumberFormatException e) {
            txtResultado.setText("Erro");
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        defineOperacao("*");
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        defineOperacao("/");
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtResultado.setText("0");
        lblOperacao.setText("");
        this.valor1 = 0;
        this.valor2 = 0;
        this.operacao = null;
        this.calculoRealizado = false; // Reseta o estado
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
        defineOperacao("+");
    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtrairActionPerformed
        defineOperacao("-");
    }//GEN-LAST:event_btnSubtrairActionPerformed

    private void btnUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUmActionPerformed
        entraNumero("1");
    }//GEN-LAST:event_btnUmActionPerformed

    private void btnDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoisActionPerformed
        entraNumero("2");
    }//GEN-LAST:event_btnDoisActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        entraNumero("3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuatroActionPerformed
        entraNumero("4");
    }//GEN-LAST:event_btnQuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        entraNumero("5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        entraNumero("6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeteActionPerformed
        entraNumero("7");
    }//GEN-LAST:event_btnSeteActionPerformed

    private void btnOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOitoActionPerformed
        entraNumero("8");
    }//GEN-LAST:event_btnOitoActionPerformed

    private void btnNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoveActionPerformed
        entraNumero("9");
    }//GEN-LAST:event_btnNoveActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnDois;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnNove;
    private javax.swing.JButton btnOito;
    private javax.swing.JButton btnQuatro;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSete;
    private javax.swing.JButton btnSomar;
    private javax.swing.JButton btnSubtrair;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUm;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel lblOperacao;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}