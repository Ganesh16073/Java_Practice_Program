package com.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class StructureLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String , LinkedHashMap<String,Data>> outer=new LinkedHashMap<>();
		LinkedHashMap<String,Data> inner=new LinkedHashMap<>();
		inner.put("1001", new Data(1,"Shyam",1000));
		inner.put("1002", new Data(2,"Ram",1000));
		outer.put("India", inner);
		
		LinkedHashMap<String,Data> ausinner=new LinkedHashMap<>();
		ausinner.put("A001", new Data(1,"Shyam",1000));
		ausinner.put("A002", new Data(2,"Ram",1000));
		outer.put("Aus", ausinner);
		
//		System.out.println(outer);
		
//		outer.forEach((key,value)->{
//			String team=key;
//			LinkedHashMap<String,Data> player=value;
//			System.out.println(team);
//			System.out.println("-----------------------------------------------------------");
//			System.out.println("Player team Id \t\t id \t\tName \t\tRun");
//			player.forEach((id,data)->
//			{
//				
//				System.out.print(id+" \t\t\t ");
//				Data l= data;
//				 System.out.println(l.getId()+"\t\t"+l.getName()+"\t\t"+l.getRun());
//
//				
//			});
//			System.out.println();
//			
//			
//		});\
		
		Iterator<String> countryIterator = outer.keySet().iterator();
        while (countryIterator.hasNext()) {
            String country = countryIterator.next();
            System.out.println("Country: " + country);
            System.out.println("-------------------------------------");
            
            LinkedHashMap<String, Data> teamData = outer.get(country);
            
            Iterator<String> playerIterator = teamData.keySet().iterator();
            while (playerIterator.hasNext()) {
                String playerId = playerIterator.next();
                Data playerData = teamData.get(playerId);
                
                System.out.print("Player ID: " + playerId+" \t");
                System.out.println(playerData);
                System.out.println();
            }
        }
//		Set<String> full= outer.keySet();
//		Collection<LinkedHashMap<String, Data>> fullin=outer.values();
//		Iterator<String> i=full.iterator();
//		while(i.hasNext())
//		{
//			String key=i.next();
//			System.out.println(key);
//			System.out.println("-------------------------------------");
//			Iterator<LinkedHashMap<String, Data>> inerKey=fullin.iterator();
//			while(inerKey.hasNext())
//			{
//				Set<String> ste=inerKey.next().keySet();
//				Collection<Data> d=inerKey.next().values();
//				Iterator it=ste.iterator();
//				while(it.hasNext())
//				{
//					System.out.println(it.next());
//					d.forEach(System.out::println);
//				}
////			}
//
//			
//		}
		
		
		
	}
		
}


class Data
{
	private int id;
	private String name;
	private int run;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", name=" + name + ", run=" + run + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, run);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Data other = (Data) obj;
		return id == other.id && Objects.equals(name, other.name) && run == other.run;
	}
	public Data() {
		super();
	}
	public Data(int id, String name, int run) {
		super();
		this.id = id;
		this.name = name;
		this.run = run;
	}
	
}