Feature: Conference Registration 

Scenario: Wrong case
	Then next
	Then first name is "siva"
	Then next
	Then lastname is "vasam"
	Then next
	Then email is "sivavasamsetti9@gmail.com"
	Then next
	Then contactno is "9989087905"
	Then next
	Then number of people attending is "2"
	Then next
	Then number of people attending is "4"
	Then next
	Then address is "rama" 
	Then next
	Then areaname is "divanam" 
	Then next
	Then city name is "Hyderabad" 
	Then next
	Then state name is "Telangana" 
	Then next
	Then cost is "memberstatus"
	Then nextpage
	Then cardholdername is "siva"
	Then nextvalue
	Then debitcardnumber is "12564547891513"
	Then nextvalue
	Then cvv is "114"
	Then nextvalue
	Then cardexpiremonth is "13"
	Then nextvalue
	Then cardexpireyear is "2024" 
	Then makepayment 
	Then close  



