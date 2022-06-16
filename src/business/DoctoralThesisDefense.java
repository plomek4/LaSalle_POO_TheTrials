package business;

public class DoctoralThesisDefense extends Trial{
    private String thesisFieldOfStudy;
    private int defenseDifficulty;

    public DoctoralThesisDefense(String thesisFieldOfStudy, int defenseDifficulty) {
        this.thesisFieldOfStudy = thesisFieldOfStudy;
        this.defenseDifficulty = defenseDifficulty;
    }
}
