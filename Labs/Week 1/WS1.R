##Question 1##
toHold <-c(141, 146, 157, 151, 152, 140, 142, 156, 150, 140,
		139, 135, 143, 146, 146, 152, 140, 136, 149, 148)
mean(toHold)
sd(toHold)

##Question 2##
#Part A
females <- c(57, 59, 78, 79, 60, 65, 68, 71, 75, 48, 51, 55, 56, 41, 43, 44, 75, 78, 80, 81,
		83, 83, 85)
males <- c(48, 49, 49, 30, 30, 31, 32, 35, 37, 41, 86, 42, 51, 53, 56, 42, 44, 50, 51, 65, 67,
51, 56, 58, 64, 64, 75)

allPeople <- c(females, males)
genders <- c(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
		1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
#Part B
allPeople[34] <- 46

#Part C
summary(allPeople)

#Part D
quantile(males)

#Part E
deciles <- seq(0,1,0.1)
quantile(males, deciles)
quantile(females, deciles)
quantile(allPeople, deciles)

#Part F
par (mfrow = c(1,3))
boxplot(males)
boxplot(females)
boxplot(allPeople)

##Question 3
results <- read.table("results.txt", header = T)
results
boxplot(results, na.rm = TRUE)
stem(results$arch1)
stem(results$prog1)
stem(results$arch2)
stem(results$prog2)

##Question 4
survey <- read.csv("CA2xx_survey_answers.csv", header = T)
numMales <- 0
numFemales <- 0
data <- na.omit(survey$Q1)
for(i in 1: length(data)){
	if(data[i] == 1){
		 numMales <- numMales + 1
	}
	if(data[i] == 2){
		 numFemales <- numFemales + 1
	}
}
numMales
numFemales
