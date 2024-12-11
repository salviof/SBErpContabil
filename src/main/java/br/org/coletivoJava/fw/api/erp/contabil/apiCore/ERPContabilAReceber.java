/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.coletivoJava.fw.api.erp.contabil.apiCore;

/**
 *
 * @author desenvolvedorninja01
 */
import com.super_bits.modulosSB.SBCore.modulos.erp.ApiERPColetivoJavaFW;
import com.super_bits.modulosSB.SBCore.modulos.erp.ItfApiErpSuperBits;

@ApiERPColetivoJavaFW(descricaoApi = "Codigo Postal BR", nomeApi = "ContaPagarReceber", slugInicial = "CtPagarReceber")
public enum ERPContabilAReceber implements ItfApiErpSuperBits<ItfERPContabil> {

    PERSONALIZADO,
    ERP_PADRAO_FLUXO_CAIXA,
    OMIE,
    CONTA_AZUL;

    @Override
    public Class<? extends ItfERPContabil> getInterface() {

        return ItfERPContabil.class;
    }
}
