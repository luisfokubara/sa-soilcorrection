package com.luisfokubara.soilcorrection.interfaces;

import com.luisfokubara.soilcorrection.NutrienteAdicional;

import java.util.Set;

public interface IFonteNutriente {
    
    public double getTeorFonte();
    public Set<NutrienteAdicional> getNutrientesAdicionais();
}
