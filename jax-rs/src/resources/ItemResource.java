package resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import entities.Item;

@Path("/item")
public class ItemResource {

	private static Map<String, String> itemMap = new HashMap<String, String>();
	static{
		itemMap.put("1", "Item 1");
		itemMap.put("2", "Item 2");
		itemMap.put("3", "Item 3");
		itemMap.put("4", "Item 4");
		itemMap.put("5", "Item 5");
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{p1}/json")
	public Item getItemAsJson(@PathParam("p1") String codigo){
		if (codigo!=null) {
			return getItem(codigo);
		}
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{p1}/xml")
	public Item getItemAsXml(@PathParam("p1") String codigo){
		if (codigo!=null) {
			return getItem(codigo);
		}
		return null;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/itens/xml")
	public Collection<Item> getItemListXml(){
		Collection<Item> itemList = new ArrayList<Item>();
		for (Entry<String, String> item : itemMap.entrySet()) {
			itemList.add(getItem(item.getKey()));			
		}
		return itemList;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/itens/json")
	public Collection<Item> getItemListJson(){
		Collection<Item> itemList = new ArrayList<Item>();
		for (Entry<String, String> item : itemMap.entrySet()) {
			itemList.add(getItem(item.getKey()));			
		}
		return itemList;
	}
	
	private Item getItem(String codigo){
		Item item = new Item();
		item.setCodigo(codigo);
		item.setDescricao(itemMap.get(codigo));
		return item;
	}
	
}
