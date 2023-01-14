# SystemDesign
# Observer Pattern example
# Implement a system where all the users who have taken a loan from a bank will be notified if interest rate is changed.
# Notification can be happen through newspaper and internet media.
# Steps :)
# 1. Make a common interface Subject that will register, remove and notify the users.
# 2. Make an interface for Observer which will recieve the updates whenever there is any change in interest rate.
# Question -> Why this update cannot be implemented on the Subject side? Because there can be many users who needs to be notified on any change. Also, this update should be on user side as this functionality will be specific to each user. 