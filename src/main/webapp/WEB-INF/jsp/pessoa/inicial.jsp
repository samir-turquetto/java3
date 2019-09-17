<%@include file="../../header.jsp" %>

<div class="container mt-5">    
    <div class="row">
        <div class="col-sm-6">
            <div class="card mt-5">
                <div class="card-body">
                    <h5 class="card-title">Listagem de Funcionários</h5>
                    <p class="card-text">Uma lista de todos os funcionários cadastrados.</p>
                    <a href="pessoa/lista" class="btn btn-info">Listar Funcionários</a>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="card mt-5">
                <div class="card-body">
                    <h5 class="card-title">Adicionar um novo Funcionário</h5>
                    <p class="card-text">Cadastro de Funcionário, para poder manupula-lo</p>
                    <a href="pessoa/formulario" class="btn btn-success">Adicionar Funcionário</a>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="../../footer.jsp" %>
