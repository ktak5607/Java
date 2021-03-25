import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private bodyTypes bodyType;
    private Key key;
    public enum bodyTypes{
        MOON,
        PLANET,
        DWARF_PLANET;
    }
    public HeavenlyBody(String name, double orbitalPeriod, bodyTypes bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.bodyType = bodyType;
        satellites = new HashSet<>();
        key = new Key(name, bodyType);
    }
    public static Key makeKey(String name, bodyTypes bodyType){
        Key newKey = new Key(name, bodyType);
        return newKey;
    }
    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }
    public bodyTypes getBodyType(){
        return this.bodyType;
    }

    public boolean addSatellite(HeavenlyBody sat){
        return this.satellites.add(sat);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
    public Key getKey(){
        return this.key;
    }
    public String getKeyName(){
        return key.name;
    }
    public bodyTypes getKeyBodyType(){
        return key.bodyType;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || (obj.getClass() != this.getClass())){
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public final int hashCode() {
        return this.name.hashCode() + 57 + this.bodyType.hashCode();
    }
    @Override
    public final String toString(){
        return this.getName() + ": " + this.getBodyType() + ", " +  this.getOrbitalPeriod();
    }

    public static final class Key{
        private String name;
        private bodyTypes bodyType;

        private Key(String name, bodyTypes bodyType){
            this.name = name;
            this.bodyType = bodyType;
        }
        @Override
        public String toString(){
            return this.name + ": " + this.bodyType;
        }
        @Override
        public boolean equals(Object obj){
            if(this == obj){
                return true;
            }
            else if(obj == null || this.getClass() != obj.getClass()){
                return false;
            }
            return this.toString().equals(obj.toString());
        }
        @Override
        public int hashCode(){
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }
    }
}

