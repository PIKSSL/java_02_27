
package aranyhal;

import java.util.HashMap;

public class Aranyhal {
    private static final int KIVANSAGOKSZAMA = 3;
    private int kor;
    private HashMap<String,Integer> kivansagok;
    private String kifogta;

    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        setKifogta(kifogta);
        this.kivansagok =  new HashMap<>();
    }
    
    public Aranyhal(String kifogta){
        this(0,kifogta);
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }
    
    public int kivansagokSzama(String kifogta){
        return 0;
    }
    
    public String[] kikkelTalalkozott(){
        return null;
    }
    
    public boolean kivansagotTeljesit(String teljesit){
        return false;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "kor=" + kor + ", kivansagok=" + kivansagok + ", kifogta=" + kifogta + '}';
    }
    
    
    
}
