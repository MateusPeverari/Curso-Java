package classe.desafio;

public class ExerciseBuilder {
    private double weightLost;
    private String exerciseName;

    public ExerciseBuilder setWeightLost(double weightLost) {
        this.weightLost = weightLost;
        return this;
    }

    public ExerciseBuilder setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
        return this;
    }

    public Exercise createExercise() {
        return new Exercise(weightLost, exerciseName);
    }
}