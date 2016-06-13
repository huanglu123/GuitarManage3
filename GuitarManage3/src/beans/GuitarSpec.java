package beans;


public class GuitarSpec
{

	private String builder;
	private String model;
	private String type;
	private String backWood;
	private String topWood;

	public GuitarSpec()
	{
	}

	public GuitarSpec(String builder, String model, String type, String backWood, String topWood)
	{
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public void setBuilder(String builder)
	{
		this.builder = builder;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void setBackWood(String backWood)
	{
		this.backWood = backWood;
	}

	public void setTopWood(String topWood)
	{
		this.topWood = topWood;
	}

	public String getBuilder()
	{
		return builder;
	}

	public String getModel()
	{
		return model;
	}

	public String getType()
	{
		return type;
	}

	public String getBackWood()
	{
		return backWood;
	}

	public String getTopWood()
	{
		return topWood;
	}

	public boolean matches(GuitarSpec otherSpec) {

		if (!builder.equals(otherSpec.builder)&&!otherSpec.builder.equals(""))
			return false;
		
		if (!model.equals(otherSpec.model)&&!otherSpec.model.equals(""))
			return false;

		if (!type.equals(otherSpec.type)&&!otherSpec.type.equals(""))
			return false;

		if (!topWood.equals(otherSpec.topWood)&&!otherSpec.topWood.equals(""))
			return false;
		
		if (!backWood.equals(otherSpec.backWood)&&!otherSpec.backWood.equals(""))
			return false;
		
		System.out.println("equal");
		return true;
	}

}