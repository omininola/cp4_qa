// Nome: Otavio Miklos Nogueira
// RM: 554513

package br.com.otaviomiklos.cp4_qa;

public class Apdex {
   
    public float calcApdex(int satisfied, int tolerating, int total) {
        return (satisfied + (float) (tolerating / 2)) / total; 
    }

}