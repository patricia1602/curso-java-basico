/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leona.cursojava.aula56;

/**
 *
 * @author leona
 */
public enum TipoDocumento {
    
    CPF {
        @Override
        public String geraNumeroTeste() {
            return GeraCpfCnpj.CPF();
        }
    }, CNPJ {
        @Override
        public String geraNumeroTeste() {
            return GeraCnpjCpf.Cnpj;
        }
    };
    
    public abstract String geraNumeroTeste();

    private static class GeraCpfCnpj {

        private static String CPF() {
            return null;
        }

        public GeraCpfCnpj() {
        }
    }

    private static class GeraCnpjCpf {

        private static String Cnpj;

        public GeraCnpjCpf() {
        }
    }
}
