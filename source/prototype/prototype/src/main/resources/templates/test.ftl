Emplois du temps de l'année ${major} +
semaine ${test}

tableau : +
<#if planning??>planning est present<#else>when-missing</#if>

<#list planning as plage>

test ${plage?string('EEE dd.MM.yyyy')} + 

<#if plage?string('EEE')== 'lun.'>planning est present<#else if plage?string('EEE')== 'lun.'>when-missing</#if>

</#list>
