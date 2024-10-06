package pe.edu.Cibertec.ws_manejo_xml_json.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name = "personas")
public class PersonaList {
    private List<Persona> personas;
    @XmlElement(name ="persona")
    public List<Persona> getPersona(){
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
