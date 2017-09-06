# Mini-proyecto 1: Yahtzee

1. For all probability calculations, assume you begin a particular hand (sequence of three rolls) with
the goal of filling a pre-specified category. Note: You will need to determine rules for which decisions
will be made when selecting which dice to keep between rolls. Make such rules explicit in your
write-ups.

2. Select three of the following YAHTZEE categories: \3 of a kind", \4 of a kind", \Full house",
\Small straight", and \Large straight". Calculate the probability of obtaining each category in a
single hand.

3. Propose a discrete random variable related to YAHTZEE. Analyze this random variable as best
as you can. For example, calculate its expected value and variance. If you cannot think of a good
random variable, then try the following: model the \Chance" category with the sum of discrete
Uniform(1,6) random variables.

4. Compute the expected value and variance of the score of one of the following categories: \Aces",
\Twos", \Threes", \Fours", \Fives", or \Sixes".

5. Select one of the following tasks and write a program (it can be an R script) that will accomplish
it. (Note: You need only do one of the three. You may do more than one, if you like.)
a. Write a program (or R script) that will simulate one of the three categories selected in part (2).
Run the simulation at least 10,000 times and record the proportion of times the category occurred.
Compare this simulated proportion with your theoretical calculation.
b. Write a program (or R script) that will simulate a hand for the \Chance" category. Run the
simulation at least 10,000 times and compare your results to part (3).
c. Write a program (or R script) that will simulate a hand for the selection you made in part (4).
Run the simulation at least 10,000 times and compute the mean and the variance. Compare with
your theoretical results from part (4).
