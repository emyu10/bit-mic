# 1) Introduction to Software Engineering
## Software Problems
> Incomplete
## Characteristics of Good Software
### 1. Operational
1. **Budget**: cost effective software
2. **Usability**: usable or fit to be used software
3. **Efficiency**: ability to do things well with minimum resources.
4. **Dependability**: software must be trustworthy and reliable. Dependability is a measure of reliability, safety and security.
5. **Safety**: keep data from threats. Data, software and hardware should be protected from intruders.

### 2. Transitional
1. **Portability**: should be easily carried or moved
2. **Inter-operability**: ability to run on hardware from different vendors regardless of the physical architecture.
3. **Reusability**: must be reusable for the future. Should be able to modify for future changes in the requirements.

### 3. Maintainable
1. **Modularity**:
    - The degree to which a system component can be separated and recombined.
    - Software that's dividable into smaller modules.
2. **Maintainability**:
    - A failed equipment, machine or system can be restored to its normal operable state within a given timeframe.
3. **Flexibility**: Ability to change or changed according to the situation.

## Characteristics of the Software as a Process
> not found

## Characteristics of the Software as a Product
> not found

## The Need for the Software Engineering Discipline
- It arises because of higher rate of change in
    - user requirements and
    - environments on which software is working

1. Large Software
    - Programmers have to study the software carefully.
2. Scalability
    - If SE is not properly done, programmers cannot scale the existing software.
3. Cost
    - Costs can increase if proper process is not adapted.
4. Dynamic Nature
    - Due to the rapid changing nature of software, programmers have to seek new methodologies.
5. Quality Management
    - To ensure quality of software.

# 2) Software Development
## Software Engineering Goals
> not found

## Importance of a phased approach to software development
> not found

### Phases or Stages of Software Development Process
#### 1. Planning
- First phase in software development.
- Checks whether there is the need for a new system.
- To find problems and determine solutions.

#### 2. System Analysis
- Analyse the performance of a software by supplying various inputs.
- Checks whether all solutions fits the requirements.
- Requirement gathering.

#### 3. System Design
- Clients (end-users) determine their information needs.
- Programmers create basic architecture.

#### 4. Development
- Coding (real programming starts here).
- Using a high level programming language.
    - Low level language
        - Only 1s and 0s.
        - Another name is machine language.
    - Assembly language
        - English-like keywords are used
        - Example: add, sub, mul, div ... etc
    - High level language
        - Modern programming languages like C, C++, VB, Java

#### 5. Integration and Testing
- Merging all modules as a whole system.
- Check all modules and integrate into one system.

#### 6. Implementation
- Installation of newly created system.
- Old system is replaced by new system.

#### 7. Maintenance
- Upgrade the system from time to time.
- To adapt changes.

### System Analyst
- Main person who is responsible for development of software / hardware.

#### Roles of System Analyst
1. Defining IT requirements
2. Gathering data
3. Analyze problem
4. Setting priority to the jobs
5. Problem solving
6. Design system
7. Evaluating system

## Phases involved in software development process
> not found

## Compare how software development companies organize their development process
> not found

# 3) Software Development Process Model
> not found

# 4) Software Development Life Cycle (SDLC)
- It is a *well defined*, *structured* sequence of *stages* in software engineering.

## Stages (Phases) of SDLC
### 1. Communication
- First step in SDLC.
- Initiate the request for software product.
- Try to negotiate the terms.
- Client gives all information to developers in writing.

### 2. Requirement Gathering
- Development team manages this stage.
- Developers collect more data from the client.
- Study the existing system with
    1. Questionnaires
    2. Interviews
- Developers collect answers from the questionnaires.

### 3. Feasibility Study
- Developers start designing a software in a cost-effective way.
- There are 4 types of feasibility study
    1. Technical feasibility
    2. Operational feasibility
    3. Economic feasibility
    4. Schedule feasibility

### 4. Detailed System Study
- Various operations are performed by the system and their relationship within and outside the system is studied.
- All the data is documented in
    1. Detailed Data Flow Diagrams
    2. Data Dictionary
    3. Logical Data Structures

### 5. System Design
- New system starts.
- Features of new system is designed.
- Cost of development is estimated.
- System Analyst selects best solution from all feasible solutions.

### 6. Coding
### 7. Testing
### 8. Implementation
### 9. Maintenance

# 5) Data Modeling
## System Elements
> Incomplete

## Cardinality and Modality
## Entity Relationship Diagram
## Data Flow Diagram
- Graphical representation of flow of data.
- Capable of showing incoming, outgoing and stored data.

    ![](assets/images/dfd_elements.png)

### Entity
- Entities are sources and destinations of information data.
- Entities are represented by rectangles with their respective names.

### Process
- Activities and actions taken on the data are represented by circle or round edged rectangles.

### Data Store
- There are 2 variants of data storage.
- It can either be represented as a rectangle with absence of both smaller sides or an open-sided rectangle with only one side missing.

### Data Flow
- Movement of data is shown by pointed arrows.
- Data movement is shown from the base of the arrow towards head of the arrow as destination.

    ![](assets/images/dfd_example1.png)

### Levels of DFD
1. Level 0
    - Highest level of DFD
    - Shows the entire information system as one diagram.
    - Example:

        ![](assets/images/dfd_level0.png)

2. Level 1
    - Level 0 is broken down to more specific level 1 modules.
    - Level 1 depicts basic modules in the system.
    - Level 1 DFD mentions basic process and source of information.
    - Example:

        ![](assets/images/dfd_level1.png)

3. Level 2
    - At this level of DFD, data flows inside the module mentioned in level 1.

## Structure Chart
- Derived from DFD.
- Represents the system more detailed than DFD.
- Breaks down the entire system into lowest functional modules, describes functions and sub functions of each module of the system.
- Represents hierarchical structure of modules.
- At each layer, a specific task is performed.

### Symbols used under structure chart
1. Module: represents process or subroutine.
    > @todo: image here
2. Condition:
    - It is represented by small diamond at base of the module.
    - It tells that control module can select any of subroutines based on some condition.
    > @todo: image here
3. Jump: An arrow is shown pointing inside the module tells that the control will jump in the middle of the sub module.
    > @todo: image here
4. Loop:
    - A curved arrow represents loop in the module.
    - Every sub module covered by loop repeat execution of module.
    > @todo: image here
5. Data Flow:
    - A directed arrow with empty circle at the end represents data flow.
6. Control Flow:
    - A directed arrow with filled circle at the end represents control flow.
    > @todo: image here

## Hipo Chart
- Developed by IBM in 1970.
- Represents the hierarchy of modules in the software system.
- System Analyst uses hipo diagram in order to obtain high level view of system functions.
- It decomposes functions into sub functions in a hierarchical manner.
> @todo: image here

## Structured English
- The description of what is required to the code and how to code it.
- Structured English helps the programmer to write error free code.
- It uses plain English words in structured programming method.
- It is not the ultimate code but a kind of description of what is required to code and how to code it.
- Example:
    ```
    enter Customer_Name<br>
    seek Customer_Name in Customer_Table
    if Customer_Name found then
        Call procedure User_Passwd
    else
        print Error_Message
        Call procedure New_Customer_Request
    end if
    ```
## Decision Tables
- A decision table represents conditions and the respective actions to be taken to address them in a structured table format.
- It is a powerful tool to debug and prevent errors.
- It helps similar information into a single table and then by combining tables, it delivers easy and convenient decision-making.
- Example:
    > @todo: image here

    | condition | rule 1 | rule 2 | rule 3 | rule 4 |
    | ---       | :---:  | :---:  | :---:  | :---:  |
    | username  | F      | T      | F      | T      |
    | password  | F      | F      | T      | T      |
    | output    | E      | E      | E      | H      |
    T - correct<br>
    F - wrong<br>
    E - error<br>
    H - home screen

## Control Flow Model
> Not found

# 6) Software Design Concepts
## Data Dictionaries
- It is a file or set of files that includes database information.
- In data dictionaries, the following information exist.
    1. **Name of data items**: fields
    2. **Aliases**: other names by which data items are called
    3. **Description**: textual description of what the data item is
    4. **Related data items**:
        - captures relationship between data items.
        - For example, total marks relate to internal marks and external marks
    5. **Range of values**:
        - records all possible values that is connected with the field.
        - For example, total marks must be positive and between 0 to 100.
    6. **Data structure definition**: data flows capture the name of processes that generate or receive the data item

### Mathematical operators used under Data Dictionary
<table>
<tr>
    <td>x = a + b</td>
    <td>x contain both a and b</td>
</tr>
<tr>
    <td>x = [a/b]</td>
    <td>x contains either a or b</td>
</tr>
<tr>
    <td>x = a X b</td>
    <td>x contains most entries from a</td>
</tr>
<tr>
    <td>x = y[a]</td>
    <td>x includes y more occurence of a</td>
</tr>
<tr>
    <td>x = [a]z</td>
    <td>x includes z fewer occurences of a</td>
</tr>
</table>


# 7) Maintenance
> not found

# 8) Computer Aided Software Engineering (CASE)
> not found


> Will put this part to somewhere later
## Requirement Analysis & Specification
The process of gathering the software requirements from the client.

It has 4 steps
1. Feasibility Study: Feasibility study is used to select a feasibile solution which follows all the user requirements.

The output of this phase should be a feasible output report which contains all user requirements.

2. Requirement gathering: getting information from client.
Types of information gathering
    1. Interview
        - a. One to One interview
        - b. Written interview
        - c. Oral interview
        - d. Group interview
    2. Surveys: Organization may conduct surveys about their expectations and needs from the upcoming system.
    3. Questionnaires: A document with a predefined set of objective questions and respective options is used to get information from the client.
    4. Brainstorming: An informational debate is held among the organization. Inputs are stored onto the database during this procedure.
    5. Prototype: It is building user interface without adding detail functionality. It helps use to give a better idea about the system. Using prototype model, user will understand the system working in a rough way.

3. Software Requirement Validation: After requirement specifications are developed, the requirements mentioned in the document are validated.
    - All features can be practically implemented or not.
    - All features are clear and complete.
4. Requirement Elicitation Process:
    - System Analyst will get information from the client and they prioritize and arrange the requirements in order of importance and urgency.
    - All these requirments are discussed with the organization and then be changed the priority of requirements.

## Coupling
Coupling is a measure that defines the level of inter-dependability among modules of a program.
It tells at what level, modules interfere & interact with each other.

### Types of coupling
#### 1. Content coupling
When module can directly access, modify, refer to the other module contents, it is called content coupling.
#### 2. Common coupling
When multiple modules have read/write permission to global data is called common coupling.
#### 3. Control coupling
Two modules are control coupled if one of then decides the function of another one.
#### 4. Stamp coupling
When multiple modules share common data structures, it is called stamp coupling.
#### 5. Data coupling
When two modules interact with each other by passing data as arguments.


## Management Skills of a System Analyst
1. Time management skills
2. Project management skills
3. Man management skills
4. Team management skills
5. Directional skills
6. Negotiation skills
7. Leadership skills
8. Training skills
9. Documentation management skills
10. Presentational skills
11. Technical skills
12. Problem solving skills
13. Creativity skills