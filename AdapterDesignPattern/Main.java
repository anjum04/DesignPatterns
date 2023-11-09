package AdapterDesignPattern;



public class Main {
	
	public static void main(String[] args)
	{
		AdapterDesignPattern.Adapter.WeightMachineAdapter weightMachineAdapter = new AdapterDesignPattern.Adapter.WeightMachineAdapterImpl(new AdapterDesignPattern.Adaptee.WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
	}

}
