package br.com.taipanet.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import br.com.taipanet.model.StatusLancamento;

@FacesConverter(forClass=StatusLancamento.class)
public class StatusLancamentoConverter implements Converter{
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String valor) {
		// TODO Auto-generated method stub
		if (valor != null && !valor.isEmpty()) {
            return (StatusLancamento) arg1.getAttributes().get(valor);
        }
        return null;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 instanceof StatusLancamento) {
			StatusLancamento entity= (StatusLancamento) arg2;
            if (entity != null && entity instanceof StatusLancamento && entity.getId() != null) {
                arg1.getAttributes().put( entity.getId().toString(), entity);
                return entity.getId().toString();
            }
        }
        return "";
	}
}
