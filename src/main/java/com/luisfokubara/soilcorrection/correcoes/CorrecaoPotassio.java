package com.luisfokubara.soilcorrection.correcoes;

import com.luisfokubara.soilcorrection.fontes.FontePotassio;
import com.luisfokubara.soilcorrection.interfaces.ICorrecaoNutriente;
import com.luisfokubara.soilcorrection.interfaces.ICorrecaoNutrienteQuantidadeAplicar;

public class CorrecaoPotassio
        implements
        ICorrecaoNutriente<FontePotassio>,
        ICorrecaoNutrienteQuantidadeAplicar<FontePotassio> {

    public double calculaNecessidadeAdicionarCMolcDm3 (
        double teorSolo,
        double participacaoCTCExistente,
        double participacaoCTCDesejada) {

            if (teorSolo <= 0) {
                throw new IllegalArgumentException();
            }

            if (participacaoCTCExistente <= 0) {
                throw new IllegalArgumentException();
            }

            if (participacaoCTCDesejada <= 0) {
                throw new IllegalArgumentException();
            }

            return (teorSolo 
                    * participacaoCTCDesejada 
                    / participacaoCTCExistente) 
                    - teorSolo;
    }

}
