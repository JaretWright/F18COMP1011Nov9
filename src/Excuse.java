public class Excuse implements Comparable<Excuse>{
    private String details;
    private int impact;

    public Excuse(String details, int impact) {
        setDetails(details);
        setImpact(impact);
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getImpact() {
        return impact;
    }

    public void setImpact(int impact) {
        if (impact >= 0 && impact <= 10)
            this.impact = impact;
        else
            throw new IllegalArgumentException("impact must be 0-10");
    }

    public String toString()
    {
        return String.format("impact: %d    excuse: %s", impact, details);
    }


    @Override
    public int compareTo(Excuse excuse) {
        if (this.getDetails().equals(excuse.details))
            return 0;

         if (this.getImpact() > excuse.getImpact())
            return 1;
        else
            return -1;

    }
}
