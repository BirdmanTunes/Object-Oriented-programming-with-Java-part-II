package week8._009_Car_Registration_Centre;

public class RegistrationPlate {
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String regCode, String country) {
       this.regCode = regCode;
       this.country = country;
    }
    
    public String getCode() {
    	return regCode;
    }
    
    public String getCountry() {
    	return country;
    }
    
    @Override
    public String toString(){
        return country+ " "+regCode;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }

        RegistrationPlate compared = (RegistrationPlate) object;

        if (this.regCode == null || !this.regCode.equals(compared.getCode())) {
            return false;
        }

        if (this.country == null || !this.country.equals(compared.getCountry())) {
            return false;
        }

        return true;
    }
    
    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 7;
        }
        return this.regCode.hashCode() + this.country.hashCode();
    }
}