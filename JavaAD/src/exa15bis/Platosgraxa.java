package exa15bis;

import java.io.Serializable;

/**
 *
 * @author oracle
 */
public class Platosgraxa implements Serializable{
   private String codigop;
   private String nomep; 
   private Integer graxatotal;
    public Platosgraxa()
	{
		this("", "",0);
	}

    public Platosgraxa(String codigop, String nomep, Integer graxatotal) {
        this.codigop = codigop;
        this.nomep = nomep;
        this.graxatotal = graxatotal;
    }
   
   

    public String getCodigop() {
        return codigop;
    }

    public String getNomep() {
        return nomep;
    }

    public Integer getGraxatotal() {
        return graxatotal;
    }

    public void setCodigop(String codigop) {
        this.codigop = codigop;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public void setGraxatotal(Integer graxatotal) {
        this.graxatotal = graxatotal;
    }

    @Override
    public String toString() {
        return "Platosgraxa{" + "codigop=" + codigop + ", nomep=" + nomep + ", graxatotal=" + graxatotal + '}';
    }
    
}
