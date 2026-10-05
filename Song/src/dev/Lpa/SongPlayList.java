package dev.Lpa;

public record SongPlayList(String title,int durationSeconds) {
    @Override
    public String toString() {
        return
                title + " " +
                "(" + durationSeconds +
                ")";
    }
}
