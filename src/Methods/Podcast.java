package Methods;

public class Podcast extends Audio {
    private String presenter;
    private String description;

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getClassification() {
        if (this.getTotalLikes() > 500) {
            return 10;
        } else {
            return 7;
        }
    }
}
