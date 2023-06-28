package com.bolsadeideas.springboot.di.app.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("miServicioBasico")
public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		
		return "Operacion procesando...";
	}
}
