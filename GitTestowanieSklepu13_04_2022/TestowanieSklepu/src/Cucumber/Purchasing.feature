Feature: Purchasing

  Scenario Outline: buy Hummingbird Printed Sweater
    Given  open the main page
    When login with my email <email> and password <password>
    And chosse to create the new address
    And set the alias <alias> address <address> city <city> zip <zip> phone <phone>
    And do the shopping
    And check the pick up method and pay method
    Then make the printscreen and the purchasing is done

    Examples:
      | email                        | password | alias   | address       | city     | zip    | phone        |
      | hcggctlmtnzicmznqu@bvhrk.com | hasło    | Brygida | Golędzinowska | Warszawa | 03-302 | 72 260 72 18 |
