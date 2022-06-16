public class DragonFly implements Drone{
    private String matricula;
    private float maxEnergy;
    private float energy;
    private int movementCount = 0;
    private float energyDelta;

    public DragonFly(String matricula, float maxEnergy, float energy, int movementCount, float energyDelta) {
        this.matricula = matricula;
        this.maxEnergy = maxEnergy;
        this.energy = energy;
        this.movementCount = movementCount;
        this.energyDelta = energyDelta;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }
    @Override
    public float energyLevel() {
        return energy;
    }

    @Override
    public void recharge() {
        if (energy == maxEnergy){
            System.out.println("Las baterías ya están llenas");
        }else{
            System.out.println("Cargando baterías... ");
            setEnergy(maxEnergy);
            System.out.println("Nivel de carga: " + energy);
        }
    }

    @Override
    public void move() {
        if (energy < energyDelta){
            System.out.println("No tene suficiente energia para moverse");
        }else{
            System.out.println("Moviendose...");
            energy = energy - energyDelta;
            movementCount++;
        }
    }

    @Override
    public String status() {
        return "El vehículo " + matricula + " tiene un nivel de carga de: " + energy + " y se ha " +
                "movido " + movementCount + " veces.";
    }

    @Override
    public void returnHome() {

    }
}
