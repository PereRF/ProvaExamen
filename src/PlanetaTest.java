import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetaTest {  
    
    Planeta Tierra = new Planeta(25,40,30,10,200);
    Planeta Marte = new Planeta(25,10,20,10,200);
    Planeta Pluton = new Planeta(25,40,30,10,200);
    Planeta Saturno = new Planeta(25,40,20,10,200);
    Planeta Saturnotemp = new Planeta(15,40,20,10,200);
    Planeta Saturnoagua = new Planeta(25,20,20,10,200);
    Planeta Saturnoradiacion = new Planeta(25,40,50,10,200);


    @Test 
    public void testConversioKelvin()
    {
        Tierra.conversioKelvin();
        assertEquals(298 , Tierra.getTemperaturaMitjana());           
    }    


    @Test 
    public void testPlanetaHabitable()
    {

        int habitabletotsvalors = Saturno.planetaHabitable();
        int nohabitabletemp = Saturnotemp.planetaHabitable();
        int nohabitableagua = Saturnoagua.planetaHabitable();
        int nohabitableradiacion = Saturnoradiacion.planetaHabitable();


        assertEquals(1, habitabletotsvalors);
        assertEquals(0, nohabitabletemp);
        assertEquals(0, nohabitableagua);
        assertEquals(0, nohabitableradiacion);

    }


    @Test 
    public void testCalculPes()
    {
        int pescalculat = Tierra.calculPes(80);
        assertEquals(800, pescalculat);
    }  
    

    @Test 
    public void testPlanetaEquilibrat()
    {
        
        int equilibrat = Marte.planetaEquilibrat();
        int noequilibrat = Pluton.planetaEquilibrat();
        assertEquals(1, equilibrat);
        assertEquals(0, noequilibrat);
    }  
}
