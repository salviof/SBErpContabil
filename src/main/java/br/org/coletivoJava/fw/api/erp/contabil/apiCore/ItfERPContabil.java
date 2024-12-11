package br.org.coletivoJava.fw.api.erp.contabil.apiCore;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.financeiro.ItfPessoaFisicoJuridico;
import java.util.List;

import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.cep.ItfLocalPostagem;
import java.util.Date;
import br.org.coletivoJava.fw.api.erp.contabil.apiCore.model.caixa.ItfContabilCaixa;
import br.org.coletivoJava.fw.api.erp.contabil.apiCore.model.registroContabil.ItfContabilRegistroOperacao;

/**
 * @author desenvolvedorninja01
 * @since 16/10/2019
 * @version 1.0
 */
public interface ItfERPContabil {

    public ItfContabilCaixa getCaixaByCodigo(String pCodigo);

    public ItfContabilRegistroOperacao salvarRegistroContabil(ItfContabilRegistroOperacao pRegistroContabil);

}
