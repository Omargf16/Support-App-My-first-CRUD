<script setup>

</script>

<template>
    <div id="issueTemplate" class="accordion w-75 mx-auto">
        <div class="accordion-item">
            <div class="accordion-header" id="issueTemplateHeader">
                <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#issueTextBox" aria-expanded="true" aria-controls="issueTextBox">
                    <p id="date" class="fs-4">
                    23/01/23
                    </p>
                    <p id="reference" class="ms-3 fw-bold fs-4">
                    test
                    </p>
                </button>
            </div>

            <div id="issueTextBox" class="accordion-collapse collapse show" aria-labelledby="issueTemplateHeader" data-bs-parent="#issueTemplate">
                <div class="accordion-body">
                    <div id="userName" class="fs-5 fw-bold">
                        Sent by:
                    </div>
                    blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla blablablabla 
                </div>
                <div class="d-md-flex justify-content-md-end">
                    <button id="deleteButton" class="rounded border border-0 bg-danger mx-3 my-2 btn btn-lg">Delete</button>
                    <button id="modifyButton" class="rounded border border-0 bg-info mx-3 my-2 btn btn-lg">Modify</button>
                </div>
            </div>
        </div>
    </div>

</template>

<style lang="scss" scoped>

</style>