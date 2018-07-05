The following variables are given:

    int redAllianceScore, blueAllianceScore;
    int redGears;
    int redHighGoalsAuto, redLowGoalsAuto;
    int redHighGoalsTele, redLowGoalsTele;
    boolean reserveGearUsed;

2 ranking points are earned for a win, 1 point for a tie, 1 point for scoring 40 kPa or more, and 1 point for the activation of four rotors. Thus, three or more points are achieved under the following conditions:

    boolean threePlusRP = (win && (kpaReached || fourRotors)) || (tie && kpaReached && fourRotors);

These are the conditions for the ranking points:

    boolean win = redAllianceScore > blueAllianceScore;
    boolean tie = redAllianceScore == blueAllianceScore;
    boolean fourRotors = (redGears >= 12 && reserveGearUsed) || redGears >= 13;
    boolean kpaReached = (redHighGoalsAuto+(redHighGoalsTele+redLowGoalsAuto)/3.0+redLowGoalsTele/9.0)>=40;
