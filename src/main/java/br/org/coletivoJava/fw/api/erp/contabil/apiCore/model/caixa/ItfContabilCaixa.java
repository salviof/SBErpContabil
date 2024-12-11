/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.org.coletivoJava.fw.api.erp.contabil.apiCore.model.caixa;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.util.List;
import br.org.coletivoJava.fw.api.erp.contabil.apiCore.model.cofre.ItfContabilCofre;
import br.org.coletivoJava.fw.api.erp.contabil.apiCore.model.registroContabil.ItfContabilRegistroOperacao;

/**
 *
 * @author salvio
 */
public interface ItfContabilCaixa extends ItfBeanSimples {

    public ItfContabilCofre getCofre();

    public List<ItfContabilRegistroOperacao> getRegistros();

    public List<ItfContabilRegistroOperacao> getRegistrosEntrada();

    public List<ItfContabilRegistroOperacao> getRegistrosSaida();

    public double getSaldoCalculado();

}
