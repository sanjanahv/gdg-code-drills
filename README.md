```mermaid
flowchart LR
    S[Student: States Research Goal] --> G[Genie: Understands Goal<br/>Searches Faculty Expertise]
    G --> R[Shows Ranked Matches<br/>(with "Why" Explanations)]
    R --> Sel[Student Selects Faculty →<br/>Sends Appointment Request]
    Sel --> F[Faculty Sees Request +<br/>Student's Idea/Background]
    F --> Decision{Faculty: Accept/Decline/More Info?}
    Decision -->|Accept| A[Appointment Scheduled<br/>Tracked in Both Dashboards]
    Decision -->|Decline| D[Request Closed<br/>Student Can Refine Goal]
    Decision -->|More Info| M[Faculty Asks Clarification]
    M --> S
```
