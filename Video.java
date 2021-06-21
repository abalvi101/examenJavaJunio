import java.util.Calendar;

public class Video extends Noticia {

    private Long video_id;

    public Video(Calendar fecha, String texto, Long video_id) {
        super(fecha, texto);
        this.video_id = video_id;
    }

    public Long getVideo_id() {
        return video_id;
    }

    public void setVideo_id(Long video_id) {
        this.video_id = video_id;
    }

    public String publica() {
        return super.publica() + "\nID del video: " + video_id;
    }

}
