package com.fmsamorim.servicesheathcheck;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fmsamorim.servicesheathcheck.models.Applications;
import com.fmsamorim.servicesheathcheck.services.ApplicationsService;

@SpringBootTest
class ServicesheathcheckApplicationTests {
	    
	@Test
	@SuppressWarnings("unchecked")
	public void testGetListaVazia() {
		ApplicationsService _applicationsService = mock(ApplicationsService.class);

		List<Applications> applications = mock(List.class);

        when(_applicationsService.getAll()).thenReturn(applications);

        List<Applications> list = _applicationsService.getAll();

        assertEquals(applications, list);
    }

}
