Feature:Creating a facebook account2
@second
Scenario Outline:Create a facebook account2
Given Launch the browserr
When Enter the firstname "<Fname>"
And Enter the lastname "<Lname>"
And Enter the email "<email>"
And Enter the new password "<password>"
And Enter the dateOfBirth "<dob>"
And Enter the gender "<gender>"
Then click the signup "<screenshot>"

Examples:
|Fname|Lname |email          |password   |dob        |gender|screenshot|
|peter|parker|abc@gmail.com  |spiderman  |29 Jan 1994|male  |1         |
|mary |jane  |abcdgmail.com  |maryjane   |11 Mar 2000|female|2         |
|Harry|osborn|xyz@gmailcom   |harryosborn|28 May 1991|male  |3         |
|Green|goblin|kljjj@gmail.com|greengoblin|30 May 1974|male  |4         |