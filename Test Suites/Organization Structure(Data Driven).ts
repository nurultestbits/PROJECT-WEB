<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Organization Structure(Data Driven)</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>cec50ca8-99a9-4e44-bb2d-53817baee4c4</testSuiteGuid>
   <testCaseLink>
      <guid>92d32370-64c9-4c0b-adbf-c1c308f0e744</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Organization Structure/TCStructure1-add new unit</testCaseId>
      <testDataLink>
         <combinationType>MANY</combinationType>
         <id>47d7ba9f-e1f7-42e3-a571-6621a97eae8d</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Data Driven- add unit</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>47d7ba9f-e1f7-42e3-a571-6621a97eae8d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>unit_id</value>
         <variableId>e22ac9ee-9537-41a6-baf6-ba4c29c52756</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>47d7ba9f-e1f7-42e3-a571-6621a97eae8d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>name_organization</value>
         <variableId>8c5b0a6f-8bca-4029-be71-d1e90201f4f9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>47d7ba9f-e1f7-42e3-a571-6621a97eae8d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>description</value>
         <variableId>9c528fd3-9256-42d6-b5c7-49dda53d32da</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>efb74784-4440-4d2a-959b-905a1dde0411</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Organization Structure/TCStructure2-not enter unit name</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>341b9e50-7e0c-4beb-a8ba-9340ea312290</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Organization Structure/TCStructure3-remove unit</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>
