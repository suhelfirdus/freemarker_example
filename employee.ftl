{  
    "employee": {  
        "name":       ${exampleObject1.name},   
        "salary":     ${exampleObject1.salary},   
<#if exampleObject1.married??>
        "married":    ${exampleObject1.married} 
</#if> 
    }  
}  
