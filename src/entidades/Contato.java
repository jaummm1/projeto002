package entidades;

public class Contato {
    private String email;
    private String fixo;
    private String celular;

    public Contato(String email) {
        setEmail(email);
    }

    public Contato(String email, String fixo, String celular) {
        this.setEmail(email);
        this.setFixo(fixo);
        this.setCelular(celular);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFixo() {
        return fixo;
    }

    public void setFixo(String fixo) {
        this.fixo = fixo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "{'Email':'" + email + "','Fixo':'" + fixo + "','Celular':'" + celular + "'}";
    }

}
