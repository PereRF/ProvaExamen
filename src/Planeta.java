//DOCUMENTAR
    /**
     * Esta es la clase planeta. Amb esta crearem objectes de tipus planeta. PPodem usar tant el constructor amb atributs com el vuit per instanciar diferents planetes
     * @author SoftwareTestingHelp
     * @version 1.0
     * @since 14/4/23
     */
  

public class Planeta 
{
    //DOCUMENTAR
    /**
     * Aquí declarem totes les variables de la clase Planeta
     */
    int temperaturaMitjana;
    int quantitatAigua;
    int radiacio;
    int gravetat;
    int distanciaSol;    

    //Contructor amb tots els parametres      
    /**
     * Este es el constructor amb tots els paràmeres de la clase Planeta.java. L'utilitzarem per a crear una instancia del objecte planeta 
     * amb tots els paràmetres
     * @param temperaturaMitjana
     * @param quantitatAigua
     * @param radiacio
     * @param gravetat
     * @param distanciaSol
     */

    public Planeta(int temperaturaMitjana, int quantitatAigua, int radiacio, int gravetat, int distanciaSol) 
    {
        this.temperaturaMitjana = temperaturaMitjana;
        this.quantitatAigua = quantitatAigua;
        this.radiacio = radiacio;
        this.gravetat = gravetat;
        this.distanciaSol = distanciaSol;
    } 

    
    //Contructor buit
    /**
     * Constructor buit per a instanciar un objecte de tipus Planeta sense paràmetres.
     */
    public Planeta(){}

    /**
     * Métode per convertir laa temperatura del planeta a graus Kelvin
     * @return void
     */
    public void conversioKelvin()
    {
        this.temperaturaMitjana = this.temperaturaMitjana + 273;          
    }

  
    /**
     * Métode per comprovar si el planeta es habitable. En ell tornarem un 1 si es compleixen les condicions per a que ho sigue
     * o un 0 si no les cumpleix
     * @return int 
     */
    public int planetaHabitable()
    {
        if(this.temperaturaMitjana >= 20 && this.temperaturaMitjana <= 45 && this.quantitatAigua >=  40 && this.radiacio < 25){

            return 1;

        }else{

            return 0;
        }
    }


    /**
     * Este métode torna el pes d'una persona en newtons en un planeta en concret. Per a fer-ho multiliquem 
     * el pes de la persona en kg per la gravetat del planeta
     * @param pesPersona
     * @return int
     */
    public int calculPes(int pesPersona)
    {
        // multiplicar el pes de la persona en Kg per el valor de la gravetat del planeta en qüestió. 
        int pesnewton = pesPersona * this.gravetat;
        
            return pesnewton;        
    }

    
    /**
     * Este métode comprova si el planeta es equibrat dividint la distancia al sol per la radiació i la compara 
     * amb la quantitat d'aigua del planeta. Si es igual el planeta es equilibrat (torna un 1)
     * sino no (torna un 0)
     * @return int
     */
    public int planetaEquilibrat()
    {
        // s'ha de complir que la quantitat d'aigua al planeta, sigui el resultat de dividir la distància respecte al sol 
        //per les unitats de radiació.
        int comparacio = this.distanciaSol/this.radiacio;
            if(comparacio == this.quantitatAigua){
            
                return 1;

            }else{
            
                return 0;
            }
        

    }


    //Getters i setters
    public int getTemperaturaMitjana() 
    {
        return temperaturaMitjana;
    }

    public void setTemperaturaMitjana(int temperaturaMitjana) 
    {
        this.temperaturaMitjana = temperaturaMitjana;
    }

    public int getQuantitatAigua() 
    {
        return quantitatAigua;
    }

    public void setQuantitatAigua(int quantitatAigua) 
    {
        this.quantitatAigua = quantitatAigua;
    }

    public int getRadiacio()
    {
        return radiacio;
    }

    public void setRadiacio(int radiacio) 
    {
        this.radiacio = radiacio;
    }

    public int getGravetat() {
        return gravetat;
    }

    public void setGravetat(int gravetat) {
        this.gravetat = gravetat;
    }

    public int getDistanciaSol() 
    {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) 
    {
        this.distanciaSol = distanciaSol;
    }    
}
