package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.stereotype.Service;

//@Service("miServicioComplejo")
public class MiServicioComplejo implements IServicio {

	@Override
	public String operacion() {
		
		return "Operacion procesando el complejo...";
	}
}
