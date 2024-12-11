/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.contabil.apiCore.model.registroContabil;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.util.Date;
import br.org.coletivoJava.fw.api.erp.contabil.apiCore.model.caixa.ItfContabilCaixa;

/**
 *
 * @author salvio
 */
public interface ItfContabilRegistroOperacao extends ItfBeanSimples {

    public ItfContabilCaixa getCaixaContabil();

    public ItfContabilCaixa getCaixaTransferencia();

    public String getCodigoPlanoDeContas();

    public Date getDataHora();

    public double getValor();

    public boolean isUmaEntrada();

    public default boolean isUmaSaida() {
        return !isUmaEntrada();
    }
}
