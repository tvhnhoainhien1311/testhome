package vn.com.nhien.config;

public class NhanVien {
	private int id;
	private String name;
	
	public NhanVien()
	{
	}
	public NhanVien(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void Setid(int manv)
	{
		manv = this.id;
	}
	public int Getid()
	{
		return id;
	}
	
	public void SetName(String tennv)
	{
		tennv = this.name;
	}
	public String GetName()
	{
		return name;
	}
	
	public String tostring()
	{
		return " ID :" +  id + "/n" + "NAME :" + name ;
	}
}
