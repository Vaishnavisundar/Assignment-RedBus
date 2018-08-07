Feature: Red Bus online ticket booking


Scenario: Online ticket booking succcessfully done

Given Display redbus page
And Enter source,destination, date and submit
And Select seat, boarding point,proceed

When name,age,gender,mailid,phone number and proceed to pay

Then Proceed to pay page and online ticket booking is done successfully  


