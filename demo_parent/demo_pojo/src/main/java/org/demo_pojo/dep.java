package org.demo_pojo;

public class dep {

	
	private Integer id;

	public dep(Integer id, String name, String tele) {
		super();
		this.id = id;
		this.name = name;
		this.tele = tele;
	}

	public dep() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	private String name;

	private String tele;
	
	
	
}
