<%@ include file="../../header.jsp" %> 
<div class="container">
    <h1><a href="/samir-project/">Samir Project</a> - Lista de Pessoas</h1>
    <table class="table table-striped table-bordered table-hover">
        <thead>
            <tr>
                <th>Nome</th>
                <th>Ações</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${pessoaList}" var="pessoa">
                <tr>
                    <td>${pessoa.nome}</td>
                    <td><a href="editar?id=${pessoa.id}">Alterar</a> | <a href="remover?id=${pessoa.id}">Remover</a> </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <c:choose>
        <c:when test="${not empty deletado}">
            <div class="alert alert-success">${deletado}</div>
        </c:when>
    </c:choose>
    <a href="<c:url value='/pessoa/formulario'/>"> Adicionar nova pessoa</a>
</div>
<%@ include file="../../footer.jsp" %> 