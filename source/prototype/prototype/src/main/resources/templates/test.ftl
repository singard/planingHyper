Emplois du temps de l'année ${major} +
semaine ${test}

tableau : +
<#if planning??>planning est present<#else>when-missing</#if>

<#list planning as plage>

<#if plage?string('EEE')== 'lun.'>
nouvelle semaine +
[grid=rows]
|=
|${plage?string('EEE dd.MM.yyyy')}<#else><#if plage?string('EEE')== 'dim.'>|${plage?string('EEE dd.MM.yyyy')}

|=
<#else> |${plage?string('EEE dd.MM.yyyy')}
</#if>
</#if>




</#list>
