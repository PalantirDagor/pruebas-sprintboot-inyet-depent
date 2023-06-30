package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.domain.Producto;
import com.bolsadeideas.springboot.di.app.models.services.IServicio;
import com.bolsadeideas.springboot.di.app.models.services.MiServicio;
import com.bolsadeideas.springboot.di.app.models.services.MiServicioComplejo;

@Configuration
public class AppConfig {

	@Bean("miServicioBasico")
	@Primary
	public IServicio registrarMiServicio() {
		
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> regitrarItems(){
		
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Bicicleta Shimano", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> regitrarItemsOficina(){
		
		Producto producto1 = new Producto("Monitor LG LCD 52 pulgadas", 250);
		Producto producto2 = new Producto("NoteBook ASUS 15 pulgadas", 500);
		Producto producto3 = new Producto("Impresora HP Multifuncional", 80);
		Producto producto4 = new Producto("Escritorio Oficina", 300);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		ItemFactura linea3 = new ItemFactura(producto3, 3);
		ItemFactura linea4 = new ItemFactura(producto4, 4);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
}
