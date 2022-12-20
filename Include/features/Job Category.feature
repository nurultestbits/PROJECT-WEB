#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@JobCategory
Feature: Job Category
  
  As a user I want to add Job Category  into the system.

  @Category1
  Scenario Outline: Successfully add new job category
    Given I login to OrangeHRM successfully
    When I click tab admin
    And I click Job list and select Job Categories
    And I click Add button
    And I enter Job Name <jobName> and click Save
    Then I should be able to add new category successfully

    Examples: 
      | jobName  |
      | IT       | 
      
  @Category2
  Scenario Outline: Users enter existing job category
    Given I login to OrangeHRM successfully
    When I click tab admin
    And I click Job list and select Job Categories
    And I click Add button
    And I enter existing Job Name <jobName>
    Then I should NOT be able to add new category
    
    Examples: 
      | jobName  |
      | IT     	 | 
    
  @Category3
  Scenario Outline: Delete a job category
    Given I login to OrangeHRM successfully
    When I click tab admin
    And I click Job list and select Job Categories
    And I mark the job category to be deleted and click delete button
    And I click delete button and select yes
    Then The job category successfully deleted
    
    Examples: 
      |  |
      |  | 
    