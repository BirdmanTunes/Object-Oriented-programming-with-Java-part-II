package week10._027_TheFinnishRingingCentre;

public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;
	
	

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    
    public String getLatinName() {
    	return latinName;
    }
    
    public int getYear() {
    	return ringingYear;
    }
    
    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        Bird compared = (Bird) object;

        if (this.latinName == null || !this.latinName.equals(compared.getLatinName())) {
            return false;
        }

        if (this.ringingYear != compared.getYear()) {
            return false;
        }

        return true;
    }
    
    @Override
    public int hashCode() {
    	if (latinName == null) {
    		return 7;
    	}
    	return latinName.hashCode() + ringingYear;
    }
}
